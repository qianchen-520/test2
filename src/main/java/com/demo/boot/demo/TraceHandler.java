package com.demo.boot.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {

  private Object target;

  public void TallingClock(Object t){
    target = t;
  }

  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    return method.invoke(target,objects);
  }
}
