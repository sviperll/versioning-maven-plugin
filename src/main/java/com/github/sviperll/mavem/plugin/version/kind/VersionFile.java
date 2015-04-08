/*
 * Copyright 2015 Victor Nazarov <asviraspossible@gmail.com>.
 */
package com.github.sviperll.mavem.plugin.version.kind;

import java.io.File;

/**
 *
 * @author Victor Nazarov <asviraspossible@gmail.com>
 */
public class VersionFile {
    String encoding = "UTF-8";
    File file;
    String type = "properties";
    Stability stability = new Stability();
}
