package com.cocky.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype模式，获取一次创建一次
 */
@Service
@Scope(value = "prototype") //
public class DemoPrototypeService {
}
