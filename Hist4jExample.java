/*
Copyright 2007 Flaptor (flaptor.com) 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

    http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
*/


import java.util.Date;
import java.util.Random;
import com.flaptor.hist4j.AdaptiveHistogram;

public class Hist4jExample {

    public static void main(String[] args) {
        Random rnd = new Random(new Date().getTime());
        AdaptiveHistogram h = new AdaptiveHistogram();

        System.out.println();
        System.out.println("Loading 10000 Gauss(0,1) data points into the histogram.");
        
        for (int i=0; i < 10000; i ++) {
            h.addValue((float)rnd.nextGaussian());
        }

        System.out.println();
        System.out.println("Main percentiles:");
        System.out.println("   5%: " + h.getValueForPercentile(5));
        System.out.println("  25%: " + h.getValueForPercentile(25));
        System.out.println("  50%: " + h.getValueForPercentile(50));
        System.out.println("  75%: " + h.getValueForPercentile(75));
        System.out.println("  95%: " + h.getValueForPercentile(95));
        System.out.println();
        System.out.println("Cumulative density:");
        for (float x=-1; x<=1; x+=0.5) {
            System.out.println("  " + x + ": " + h.getAccumCount(x));
        }
        System.out.println();
    }
}
