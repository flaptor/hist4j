Introduction
============
Hist4J is a simple high-performace value aggregator that allows you to query it for accumulated percentiles.

The gist of it is allowing you to store a very large list of mesures (several **millions**) in a **memory limited** structure, and then query for particular percentiles.

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
//print somewhere h.getValueForPercentile(95)</code></pre>


Example
=======

In the root project directory, the file Hist4jExample.java shows a minimal but useful example. Just run <code>./run_example.sh</code> to compile and run.
