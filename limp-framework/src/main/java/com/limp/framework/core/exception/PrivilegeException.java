package com.limp.framework.core.exception;

public class PrivilegeException extends RuntimeException {
    public PrivilegeException() {
    }

    public PrivilegeException(String message) {
        super(message);
    }

    public PrivilegeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrivilegeException(Throwable cause) {
        super(cause);
    }
}
