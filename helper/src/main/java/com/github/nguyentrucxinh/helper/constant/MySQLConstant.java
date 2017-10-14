package com.github.nguyentrucxinh.helper.constant;

/**
 * Defines constant values for MySQL.
 */
public class MySQLConstant {

    /**
     * Prevents user from initialize instance.
     */
    private MySQLConstant() {
    }

    public static final int VARCHAR_MAX = 255;
    public static final int TEXT_MAX = 65535;
    public static final long BIGINT_MAX = 9223372036854775807L;
    public static final double BIGINT_UNSIGNED_MAX = 18446744073709551615D;
    public static final long REAL_MAX = Long.MAX_VALUE;
}


