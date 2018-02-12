package com.cocky.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 单例模式，容器内共享唯一对象
 */
@Service
@Scope
public class DemoSingletonService {
}
