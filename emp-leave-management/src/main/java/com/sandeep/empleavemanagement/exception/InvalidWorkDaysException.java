package com.sandeep.empleavemanagement.exception;

public class InvalidWorkDaysException extends  RuntimeException{

 public   InvalidWorkDaysException(String reason)
 {
     super(reason);
 }
}
