package codeSignal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class LongestUncorruptedSegmentTest {

    @Before
    public void setup() {

    }

    @Test
    public void test() {

        int expectedResult[] = { 4, 2 };

        int[] sourceArray = { 33531593, 96933415, 28506400, 39457872, 29684716, 86010806 };
        int[] destinationArray = { 33531593, 96913415, 28506400, 39457872, 29684716, 86010806 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test2() {

        int expectedResult[] = { 0, 0 };

        int[] sourceArray = { 10000000 };
        int[] destinationArray = { 99999999 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test3() {

        int expectedResult[] = { 7, 3 };

        int[] sourceArray = { 20800440, 98256958, 64277103, 40475664, 98589505, 31621824, 84322264, 58283379, 15631261,
                35464021 };
        int[] destinationArray = { 20800440, 95256958, 64276103, 40475664, 98589505, 31621824, 84322264, 58283379,
                15631261, 35464021 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test4() {

        int expectedResult[] = { 0, 0 };

        int[] sourceArray = { 28813641, 31985183, 49809398, 48959083, 59368847, 37296474, 92567090, 50320165, 12197477,
                28906340 };
        int[] destinationArray = { 38813641, 31983183, 49879398, 48959043, 59468847, 35296474, 92567020, 80320165,
                14197477, 28906360 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test5() {

        int expectedResult[] = { 4, 0 };

        int[] sourceArray = { 92988800, 80253955, 17396563, 91682092, 77708269, 97587946, 23889892, 20661856, 21013095,
                92028000, 17562863, 86804822, 17819093, 97941923, 64955308 };
        int[] destinationArray = { 92988800, 80253955, 17396563, 91682092, 77708229, 97587946, 23889892, 20661866,
                21013095, 92928000, 17962863, 86804822, 14819093, 97241923, 62955308 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test6() {

        int expectedResult[] = { 4, 6 };

        int[] sourceArray = { 99919628, 77504204, 18846830, 86785029, 86230362, 96953294, 53208680, 95327090, 68996760,
                26366538, 90490275, 62583792, 87514087, 96921389, 21309822 };
        int[] destinationArray = { 99919628, 77503204, 18546830, 86785029, 86230362, 96953264, 53208680, 95327090,
                68996760, 26366538, 90420275, 62583792, 87514087, 39692139, 21303822 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test7() {

        int expectedResult[] = { 4, 7 };

        int[] sourceArray = { 99919628, 99919628, 77504204, 18846830, 86785029, 86230362, 96953294, 53208680, 95327090,
                68996760, 26366538, 90490275, 62583792, 87514087, 96921389, 21309822 };
        int[] destinationArray = { 99919629, 99919628, 77503204, 18546830, 86785029, 86230362, 96953264, 53208680,
                95327090, 68996760, 26366538, 90420275, 62583792, 87514087, 39692139, 21303822 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test8() {

        int expectedResult[] = { 4, 3 };

        int[] sourceArray = { 33531593, 96933415, 96933415, 28506400, 39457872, 29684716, 86010806 };
        int[] destinationArray = { 33531593, 96913415, 96913415, 28506400, 39457872, 29684716, 86010806 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test9() {

        int expectedResult[] = { 1, 0 };

        int[] sourceArray = { 33531593 };
        int[] destinationArray = { 33531593 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test10() {

        int expectedResult[] = { 4, 9 };

        int[] sourceArray = { 33531591, 33531591, 33531591, 33531591, 33531591, 33531593, 33531593, 33531593, 33531591,
                33531591, 33531591, 33531591, 33531591 };
        int[] destinationArray = { 33531593, 33531593, 33531591, 33531591, 33531593, 33531593, 33531593, 33531593,
                33531593, 33531591, 33531591, 33531591, 33531591 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

    @Test
    public void test11() {

        int expectedResult[] = { 3, 0 };

        int[] sourceArray = { 1, 2, 3 };
        int[] destinationArray = { 1, 2, 3 };

        LongestUncorruptedSegment test = new LongestUncorruptedSegment();
        int result[] = test.longestUncorruptedSegment(sourceArray, destinationArray);
        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);

    }

}
