/*
 * Copyright (c) 2010-2018 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.reflection.java.bytecode.asm;

import com.openpojo.validation.affirm.Affirm;
import org.junit.Test;

/**
 * @author oshoukry
 */
public class ASMDetectorTest {
  ASMDetector asmDetector = ASMDetector.getInstance();

  @Test
  public void canDetectASMLoaded() {
    Affirm.affirmTrue("ASM should've been detected as loaded", asmDetector.isASMLoaded());
  }

  @Test
  public void canDetectASMLoadedUsingGivenClass() {

  }
}
