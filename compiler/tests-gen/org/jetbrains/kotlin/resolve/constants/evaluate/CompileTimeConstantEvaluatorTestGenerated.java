/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.resolve.constants.evaluate;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class CompileTimeConstantEvaluatorTestGenerated extends AbstractCompileTimeConstantEvaluatorTest {
    @TestMetadata("compiler/testData/evaluate/constant")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Constant extends AbstractCompileTimeConstantEvaluatorTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doConstantTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInConstant() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/evaluate/constant"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("classObjectProperty.kt")
        public void testClassObjectProperty() throws Exception {
            runTest("compiler/testData/evaluate/constant/classObjectProperty.kt");
        }

        @TestMetadata("compareTo.kt")
        public void testCompareTo() throws Exception {
            runTest("compiler/testData/evaluate/constant/compareTo.kt");
        }

        @TestMetadata("differentTypes.kt")
        public void testDifferentTypes() throws Exception {
            runTest("compiler/testData/evaluate/constant/differentTypes.kt");
        }

        @TestMetadata("divideByZero.kt")
        public void testDivideByZero() throws Exception {
            runTest("compiler/testData/evaluate/constant/divideByZero.kt");
        }

        @TestMetadata("equals.kt")
        public void testEquals() throws Exception {
            runTest("compiler/testData/evaluate/constant/equals.kt");
        }

        @TestMetadata("exceptionWhenEvaluate.kt")
        public void testExceptionWhenEvaluate() throws Exception {
            runTest("compiler/testData/evaluate/constant/exceptionWhenEvaluate.kt");
        }

        @TestMetadata("finalProperty.kt")
        public void testFinalProperty() throws Exception {
            runTest("compiler/testData/evaluate/constant/finalProperty.kt");
        }

        @TestMetadata("float.kt")
        public void testFloat() throws Exception {
            runTest("compiler/testData/evaluate/constant/float.kt");
        }

        @TestMetadata("floatsAndDoubles.kt")
        public void testFloatsAndDoubles() throws Exception {
            runTest("compiler/testData/evaluate/constant/floatsAndDoubles.kt");
        }

        @TestMetadata("integer.kt")
        public void testInteger() throws Exception {
            runTest("compiler/testData/evaluate/constant/integer.kt");
        }

        @TestMetadata("integerOperations.kt")
        public void testIntegerOperations() throws Exception {
            runTest("compiler/testData/evaluate/constant/integerOperations.kt");
        }

        @TestMetadata("integers.kt")
        public void testIntegers() throws Exception {
            runTest("compiler/testData/evaluate/constant/integers.kt");
        }

        @TestMetadata("localVal.kt")
        public void testLocalVal() throws Exception {
            runTest("compiler/testData/evaluate/constant/localVal.kt");
        }

        @TestMetadata("localVar.kt")
        public void testLocalVar() throws Exception {
            runTest("compiler/testData/evaluate/constant/localVar.kt");
        }

        @TestMetadata("nonFinalProperty.kt")
        public void testNonFinalProperty() throws Exception {
            runTest("compiler/testData/evaluate/constant/nonFinalProperty.kt");
        }

        @TestMetadata("objectProperty.kt")
        public void testObjectProperty() throws Exception {
            runTest("compiler/testData/evaluate/constant/objectProperty.kt");
        }

        @TestMetadata("strings.kt")
        public void testStrings() throws Exception {
            runTest("compiler/testData/evaluate/constant/strings.kt");
        }

        @TestMetadata("topLevelVal.kt")
        public void testTopLevelVal() throws Exception {
            runTest("compiler/testData/evaluate/constant/topLevelVal.kt");
        }

        @TestMetadata("topLevelVar.kt")
        public void testTopLevelVar() throws Exception {
            runTest("compiler/testData/evaluate/constant/topLevelVar.kt");
        }

        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            runTest("compiler/testData/evaluate/constant/unaryMinusIndepWoExpType.kt");
        }

        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            runTest("compiler/testData/evaluate/constant/unaryMinusIndependentExpType.kt");
        }
    }

    @TestMetadata("compiler/testData/evaluate/isPure")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class IsPure extends AbstractCompileTimeConstantEvaluatorTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doIsPureTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInIsPure() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/evaluate/isPure"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("innerToType.kt")
        public void testInnerToType() throws Exception {
            runTest("compiler/testData/evaluate/isPure/innerToType.kt");
        }

        @TestMetadata("namedConstants.kt")
        public void testNamedConstants() throws Exception {
            runTest("compiler/testData/evaluate/isPure/namedConstants.kt");
        }

        @TestMetadata("toType.kt")
        public void testToType() throws Exception {
            runTest("compiler/testData/evaluate/isPure/toType.kt");
        }

        @TestMetadata("unaryMinusIndepWoExpType.kt")
        public void testUnaryMinusIndepWoExpType() throws Exception {
            runTest("compiler/testData/evaluate/isPure/unaryMinusIndepWoExpType.kt");
        }

        @TestMetadata("unaryMinusIndependentExpType.kt")
        public void testUnaryMinusIndependentExpType() throws Exception {
            runTest("compiler/testData/evaluate/isPure/unaryMinusIndependentExpType.kt");
        }
    }

    @TestMetadata("compiler/testData/evaluate/usesVariableAsConstant")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class UsesVariableAsConstant extends AbstractCompileTimeConstantEvaluatorTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doUsesVariableAsConstantTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInUsesVariableAsConstant() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/evaluate/usesVariableAsConstant"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("binaryTypes.kt")
        public void testBinaryTypes() throws Exception {
            runTest("compiler/testData/evaluate/usesVariableAsConstant/binaryTypes.kt");
        }

        @TestMetadata("NamedConstants.kt")
        public void testNamedConstants() throws Exception {
            runTest("compiler/testData/evaluate/usesVariableAsConstant/NamedConstants.kt");
        }

        @TestMetadata("OtherTypes.kt")
        public void testOtherTypes() throws Exception {
            runTest("compiler/testData/evaluate/usesVariableAsConstant/OtherTypes.kt");
        }

        @TestMetadata("simpleTypes.kt")
        public void testSimpleTypes() throws Exception {
            runTest("compiler/testData/evaluate/usesVariableAsConstant/simpleTypes.kt");
        }
    }
}
