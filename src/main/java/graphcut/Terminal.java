/**
 * Graph cut implementation for images.
 *
 * This implementation was <b>heavily</b> inspired by the implementation
 * provided by Kolmogorov and Boykov: MAXFLOW version 3.01.
 *
 * From the README of the library:
 *
 *	This software library implements the maxflow algorithm described in
 *
 *	"An Experimental Comparison of Min-Cut/Max-Flow Algorithms for Energy
 *	Minimization in Vision."
 *	Yuri Boykov and Vladimir Kolmogorov.
 *	In IEEE Transactions on Pattern Analysis and Machine Intelligence
 *	(PAMI),
 *	September 2004
 *
 *	This algorithm was developed by Yuri Boykov and Vladimir Kolmogorov
 *	at Siemens Corporate Research. To make it available for public
 *	use, it was later reimplemented by Vladimir Kolmogorov based on open
 *	publications.
 *
 *	If you use this software for research purposes, you should cite
 *	the aforementioned paper in any resulting publication.
 *
 * @author Jan Funke <jan.funke@inf.tu-dresden.de>
 * @version 0.1
 */
package graphcut;

/**
 * The two possible segments, represented as special terminal nodes in the graph.
 */
public enum Terminal {

	FOREGROUND, // a.k.a. the source
	BACKGROUND; // a.k.a. the sink
}