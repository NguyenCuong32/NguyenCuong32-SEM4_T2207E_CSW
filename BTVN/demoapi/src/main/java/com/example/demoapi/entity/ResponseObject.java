package com.example.demoapi.entity;

public class ResponseObject {
//    private String  status;
//    private int errorcode;
//    private Object data;
//    public ResponseObject(){}
//
//    public ResponseObject(String status, int errorcode, Object data) {
//        this.status = status;
//        this.errorcode = errorcode;
//        this.data = data;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public Integer getMessage() {
//        return errorcode;
//    }
//
//    public void setMessage(Integer errorcode) {
//        this.errorcode = errorcode;
//    }
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }}

    private String status;
    private String errorCode;

    public ResponseObject() {}

    public ResponseObject(String status, String errorCode) {
        this.status = status;
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
