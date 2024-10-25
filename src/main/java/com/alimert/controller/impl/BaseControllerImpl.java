package com.alimert.controller.impl;

import com.alimert.model.RootEntity;

public class BaseControllerImpl {

        public <T> RootEntity<T> ok(T data) {
            return RootEntity.ok(data);

        }

        public <T> RootEntity<T> error(String errorMessage) {
            return RootEntity.error(errorMessage);
        }
}
