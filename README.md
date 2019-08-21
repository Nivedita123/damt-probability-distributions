# Probability distributions sample generator

The rogram generates simulated samples from a giving distribution by using samples generated from a Standard Uniform Distribution (Random Number Generator).
The type of distribution and the parameters are given as command line arguments.

#### Command line format -

<number-of-samples> <distribution> <parameters>     
An example of a call would be:        
5 bernoulli 0.3     
Here we want to generate 5 separate samples of bernoulli trials where each trial has a probability of 0.3 of succeeding     
  
#### Supported distributions

- bernoulli `<p>`
- binomial `<n>` `<p>`
- geometric `<p>`
- neg-binomial `<k>` `<p>`
- poisson `<λ>`
- arb-discrete `<p0>` `<p1>` `<p2>` … `<pn>`
- uniform `<a>` `<b>`
- exponential `<λ>`
- gamma `<α>` `<λ>`
- normal `<μ>` `<σ>`



#### Note:
Part of CSE 5301: Data Analysis and Modelling techniques course by Prof. Vamsi Krishna Gopi Krishna at The University of Texas at Arlington.

