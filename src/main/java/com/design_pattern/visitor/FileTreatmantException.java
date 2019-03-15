package com.design_pattern.visitor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FileTreatmantException extends Throwable {
    public FileTreatmantException(String msg) {
        super(msg);
    }
}
