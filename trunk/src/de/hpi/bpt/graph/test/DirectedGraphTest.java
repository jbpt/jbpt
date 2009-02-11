/**
 * Copyright (c) 2008 Artem Polyvyanyy
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.hpi.bpt.graph.test;

import junit.framework.TestCase;
import de.hpi.bpt.graph.DirectedEdge;
import de.hpi.bpt.graph.DirectedGraph;
import de.hpi.bpt.graph.algo.DirectedGraphAlgorithms;
import de.hpi.bpt.graph.algo.GraphAlgorithms;
import de.hpi.bpt.hypergraph.abs.Vertex;

public class DirectedGraphTest extends TestCase {
	DirectedGraph g = new DirectedGraph();
	
	GraphAlgorithms<DirectedEdge, Vertex> ga = new GraphAlgorithms<DirectedEdge, Vertex>();
	DirectedGraphAlgorithms<DirectedEdge, Vertex> dga = new DirectedGraphAlgorithms<DirectedEdge, Vertex>();
	
	@SuppressWarnings("all")
	public void testSomeBehavior() {
		Vertex v1 = new Vertex("V1");
		Vertex v2 = new Vertex("V2");
		Vertex v3 = new Vertex("V3");
		Vertex v4 = new Vertex("V4");
		Vertex v5 = new Vertex("V5");
		Vertex v6 = new Vertex("V6");
		
		DirectedEdge e1 = g.addEdge(v1, v2);
		DirectedEdge e2 = g.addEdge(v2, v3);
		DirectedEdge e3 = g.addEdge(v2, v4);
		
		assertTrue(ga.isConnected(g));
		
		assertEquals(3,ga.getBoundaryVertices(g).size());
		assertEquals(0,g.getDisconnectedVertices().size());
		assertEquals(4,g.getConnectedVertices().size());
		
		assertNotNull(g.addVertex(v5));
		assertEquals(1,g.getDisconnectedVertices().size());
		assertEquals(4,g.getConnectedVertices().size());
		assertEquals(5,g.countVertices());
		assertEquals(3,g.countEdges());
		
		assertTrue(g.getAdjacent(v1).iterator().next().equals(v2));
		
		assertEquals(0, g.getPredecessors(v1).size());
		assertEquals(1, g.getSuccessors(v1).size());
		
		
		
		
		
		
		
		
		
		
		////
		//assertEquals(1,dga.getInputVertices(g).size());
		
	}
}
