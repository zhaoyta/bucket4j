/*
 *
 *   Copyright 2015-2017 Vladimir Bukhtoyarov
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.bucket4j;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConsumptionProbeTest {

    @Test
    public void getRemainingTokens() throws Exception {
        assertEquals(0, ConsumptionProbe.rejected(-1, 10).getRemainingTokens());
        assertEquals(0, ConsumptionProbe.rejected(0, 10).getRemainingTokens());
    }

    @Test
    public void testToString() throws Exception {
        System.out.println(ConsumptionProbe.consumed(1));
        System.out.println(ConsumptionProbe.rejected(-1, 10));
        System.out.println(ConsumptionProbe.rejected(0, 10));
    }

}