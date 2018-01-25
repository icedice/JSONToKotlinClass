package com.mighty16.json.resolver;

import com.intellij.openapi.fileTypes.FileType;

public abstract class LanguageResolver {

    public static final String TYPE_INTEGER = "Integer";
    public static final String TYPE_LONG = "Long";
    public static final String TYPE_STRING = "String";
    public static final String TYPE_DOUBLE = "Double";
    public static final String TYPE_BOOLEAN = "Boolean";

    public abstract String resolve(String javaType);

    public abstract String getClassName(String jsonKey);

    public abstract String getFieldName(String jsonKey);

    public abstract String getDefaultValue(String type);

    public abstract String getArrayType(String type);

    public abstract String getModifier(boolean mutable);

    public abstract boolean isModifierMutable(String modifier);

    public abstract String getFileName(String className);

    public abstract FileType getFileType();

    public int getNoCharPosition(String name) {
        char[] chars = name.toCharArray();
        int pos = 0;
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
