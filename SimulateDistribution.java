import java.util.*;

public class SimulateDistribution {

	public static void main(String args[]) {

		if (args.length < 2) {

			System.out.println("Missing parameters!");
			return;
		}

		// number of samples required
		int numOfSamples = Integer.parseInt(args[0]);

		// distribution type
		String dist = args[1];

		// seed value for random number generator
		Long seed = 1222L;

		Distribution d = new Distribution(seed);

		// bernoulli(p)
		if (dist.equalsIgnoreCase("bernoulli")) {

			if (args.length < 3) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 1 parameters(s).");
			} else {

				// fetch parameters of the distribution
				double p = Double.parseDouble(args[2]);

				// generate samples
				List<Integer> samples = d.generateBernoulli(numOfSamples, p);
				System.out.println(samples);

			}

		}
		// binomial (n, p)
		else if (dist.equalsIgnoreCase("binomial")) {

			if (args.length < 4) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 2 parameters(s).");
			} else {

				// fetch parameters of the distribution
				int n = Integer.parseInt(args[2]);
				double p = Double.parseDouble(args[3]);

				// generate samples
				List<Integer> samples = d.generateBinomial(numOfSamples, n, p);
				System.out.println(samples);

			}

		}
		// geometric (p)
		else if (dist.equalsIgnoreCase("geometric")) {

			if (args.length < 3) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 1 parameters(s).");
			} else {

				// fetch parameters of the distribution
				double p = Double.parseDouble(args[2]);

				// generate samples
				List<Integer> samples = d.generateGeometric(numOfSamples, p);
				System.out.println(samples);

			}

		}
		// neg-binomial (p)
		else if (dist.equalsIgnoreCase("neg-binomial")) {

			if (args.length < 4) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 2 parameters(s).");
			} else {

				// fetch parameters of the distribution
				int k = Integer.parseInt(args[2]);
				double p = Double.parseDouble(args[3]);

				// generate samples
				List<Integer> samples = d.generateNegBinomial(numOfSamples, k, p);
				System.out.println(samples);

			}

		}

		// poisson (lambda)
		else if (dist.equalsIgnoreCase("poisson")) {

			if (args.length < 3) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 1 parameters(s).");

			} else {

				// fetch parameters of the distribution
				int lambda = Integer.parseInt(args[2]);

				// generate samples
				List<Integer> samples = d.generatePoisson(numOfSamples, lambda);
				System.out.println(samples);
			}
		}

		// arb-discrete (p1, p2, .. pn)
		else if (dist.equalsIgnoreCase("arb-discrete")) {

			if (args.length < 3) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires atleast 1 parameters(s).");
			} else {

				List<Double> p = new ArrayList<Double>();

				// fetch parameters of the distribution
				for (int i = 2; i < args.length; i++) {
					p.add(Double.parseDouble(args[i]));
				}

				// generate samples
				List<Integer> samples = d.generateArbDiscrete(numOfSamples, p);
				System.out.println(samples);
			}
		}

		// uniform (a, b)
		else if (dist.equalsIgnoreCase("uniform")) {

			if (args.length < 4) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 2 parameters(s).");
			} else {

				// fetch parameters of the distribution
				double a = Double.parseDouble(args[2]);
				double b = Double.parseDouble(args[3]);

				// generate samples
				List<Double> samples = d.generateUniform(numOfSamples, a, b);
				System.out.println(samples);
			}
		}
		// exponential (lambda)
		else if (dist.equalsIgnoreCase("exponential")) {

			if (args.length < 3) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 1 parameters(s).");
			} else {

				// fetch parameters of the distribution
				double lambda = Double.parseDouble(args[2]);

				// generate samples
				List<Double> samples = d.generateExponential(numOfSamples, lambda);
				System.out.println(samples);
			}
		}

		// gamma (alpha, lambda)
		else if (dist.equalsIgnoreCase("gamma")) {

			if (args.length < 4) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 2 parameters(s).");
			} else {

				// fetch parameters of the distribution
				int alpha = Integer.parseInt(args[2]);
				double lambda = Double.parseDouble(args[3]);

				// generate samples
				List<Double> samples = d.generateGamma(numOfSamples, alpha, lambda);
				System.out.println(samples);
			}
		}
		// normal (mean, sd)
		else if (dist.equalsIgnoreCase("normal")) {

			if (args.length < 4) {

				System.out.println("MISSING PARAMETERS: " + dist + " requires 2 parameters(s).");
			} else {

				// fetch parameters of the distribution
				double mu = Double.parseDouble(args[2]);
				double sigma = Double.parseDouble(args[3]);

				// generate samples
				List<Double> samples = d.generateNormal(numOfSamples, mu, sigma);
				System.out.println(samples);
			}
		}

		else {

			System.out.println(dist + " distribution is not supported!");
		}
	}

}
