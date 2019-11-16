package com.lanc4r.phoenix.utils.util.Others;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * @author Lanc4r
 * @create 2019-11-16 4:13 PM
 *
 * 反射工具类
 */
public class ReflectorUtils {

    private static final Map<Class<?>, Map<String, Field>> CLASS_FIELD_KV_CACHE = new HashMap<Class<?>, Map<String, Field>>();

    /**
     * 获取类的字段map
     *
     * @param clazz
     * @return Map<String, Field>
     */
    public static Map<String, Field> getClassFieldMap(Class<?> clazz) {
        Map<String, Field> fields = CLASS_FIELD_KV_CACHE.get(clazz);
        if (fields == null) {
            synchronized (clazz) {
                if (!CLASS_FIELD_KV_CACHE.containsKey(clazz)) {
                    CLASS_FIELD_KV_CACHE.put(clazz, fields = collectFieldMap(clazz));
                } else {
                    fields = CLASS_FIELD_KV_CACHE.get(clazz);
                }
            }
        }
        return fields;
    }

    /**
     * 获取对象字段值
     *
     * @param obj
     * @param fieldName
     * @return Object
     */
    public static Object getValue(final Object obj, String fieldName) {
        Object value = null;
        Field field = getClassFieldMap(obj.getClass()).get(fieldName);
        if (field != null) {
            try {
                value = field.get(obj);
            } catch (Exception e) {
//                logger.warn(obj.getClass().getName() + " reflect get " + fieldName + " value fail");
            }
        }
        return value;
    }

    private static Map<String, Field> collectFieldMap(Class<?> clazz) {
        Map<String, Field> map = new HashMap<String, Field>();
        List<AccessibleObject> fields = new ArrayList<AccessibleObject>();
        Class<?> superClazz = clazz;
        while (superClazz != null && superClazz != Object.class) {
            fields.addAll(Arrays.asList(superClazz.getDeclaredFields()));
            superClazz = superClazz.getSuperclass();
        }
        for (AccessibleObject ao : fields) {
            ao.setAccessible(true);
            Field field = (Field) ao;
            int mod = field.getModifiers();
            if (Modifier.isFinal(mod)) {
                continue;
            }
            map.put(field.getName(), field);
        }
        return map;
    }

    /**
     * 收集list里面对象字段field的值到集合
     *
     * @param list
     * @param field
     * @return List<T>
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> List<T> fetchFieldValue(List<?> list, String field) {
        List<T> result = new ArrayList<T>();
        if (list == null || list.isEmpty() || field == null || field.trim().length() == 0) {
            return result;
        }
        for (Object obj : list) {
            Object value = null;
            if (obj instanceof Map) {
                value = ((Map) obj).get(field);
            } else {
                value = getValue(obj, field);
            }
            if (value != null) {
                result.add((T) value);
            }
        }
        return result;
    }

}
