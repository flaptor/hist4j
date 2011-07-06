Introduction
============
Hist4J is a simple high-performace value aggregator that accepts large datasets with any distribution or range and provides several statistical functions, using a very small memory footprint and requiring no pre- or post-processing.

Hist4j has the following features:

 - It adapts to any data distribution, keeping a more or less constant resolution throughout the data range by increasing the resolution where the data is more dense.
 - It can process large amounts of data with a very small memory footprint.
 - It doesn't need pre- or post-processing to deliver statistics about the data seen so far.

The following statistics are currently available:

 - The cumulative density function for a given data point.
 - The data point that splits the data set at a given percentile.


Installation
============

The default ant target will generate *hist4j-trunk.jar*.

Licence
=======

Apache 2.0


Usage
=====

A typical use case is mesuring response times of a service. In this case, we can create a histogram object:

<code>AdaptiveHistogram h = new Histogram();

Then, for every service response, we log the time:

<code>h.addValue(elapsedTime);</code>

On fixed intervals (maybe a few minutes, maybe a few hours), recreate the histogram object, and print the information of the old one:

<pre><code>hOld = h;
h = new Histogram()
//print hOld.getValueForPercentile(95)</code></pre>


Example
=======

In the root project directory, the file Hist4jExample.java shows a minimal but useful example. Just run <code>./run_example.sh</code> to compile and run.
