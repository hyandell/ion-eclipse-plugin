/* Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at:
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.ionxtext.tests;

import static software.amazon.ionxtext.tests.UnitTestUtils.SKIPPED_BAD_FILES;
import static software.amazon.ionxtext.tests.UnitTestUtils.getTestdataFiles;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Tests that our parser validates all the SKIPPED "bad" files in the
 * test suite.
 */
@RunWith(Injected.class)
public class SkippedBadFilesTest
    extends FileLoadingTestCase
{
    @Injected.Inject("testFile")
    public static final File[] FILES =
        getTestdataFiles("bad", SKIPPED_BAD_FILES);


    @Test
    public void noErrorsAreReported()
        throws Exception
    {
        parseSuccessfully();
    }
}
