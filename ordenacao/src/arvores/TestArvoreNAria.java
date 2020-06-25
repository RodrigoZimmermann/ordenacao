package arvores;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

/*
 * @author Marcel
 */

class TestArvoreNAria {
	static double nota = 0;
	@Rule
	public Timeout globalTimeout = Timeout.seconds(2);

	@AfterAll
	public static void apresentaNota() {
		System.out.format("\nNOTA = %1$f \n",nota);
	}
	
	/**
	 * Test of toString method, of class Arvore.
	 */
	@Test
	public void testCriacaoArvore1() {
		System.out.println("testCriacaoArvore1");
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		System.out.println(a.toString());
		assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", a.toString());
		nota += 0.5;
	}

	@Test
	public void testCriacaoArvore2() {
		System.out.println("testCriacaoArvore2");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n9.inserirFilho(n10);
		n7.inserirFilho(n9);
		n7.inserirFilho(n8);

		n1.inserirFilho(n7);
		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		System.out.println(a.toString());
		assertEquals("<1<2<3<4>><5>><6><7<8><9<10>>>>", a.toString());
		nota += 0.5;
	}

	/*
	 * Testes de altura da árvore - getAltura
	 */

	@Test
	final void testAlturaVazia() {
		Arvore<Integer> a = new Arvore<>();
		assertEquals(-1, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura00() {
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		assertEquals(0, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura01() {

		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(1, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura02() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(2, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura03A() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		n7.inserirFilho(n11);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(3, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura03B() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n12 = new NoArvore<Integer>(12);
		n10.inserirFilho(n12);

		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		n7.inserirFilho(n11);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(3, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura04A() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n12 = new NoArvore<Integer>(12);
		n10.inserirFilho(n12);
		NoArvore<Integer> n13 = new NoArvore<Integer>(13);
		n12.inserirFilho(n13);

		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		n7.inserirFilho(n11);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(4, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura04B() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n12 = new NoArvore<Integer>(12);
		n10.inserirFilho(n12);
		NoArvore<Integer> n13 = new NoArvore<Integer>(13);
		n12.inserirFilho(n13);

		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);
		NoArvore<Integer> n14 = new NoArvore<Integer>(14);
		n8.inserirFilho(n14);
		NoArvore<Integer> n15 = new NoArvore<Integer>(15);
		n14.inserirFilho(n15);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		n7.inserirFilho(n11);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(4, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura05() {
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		n9.inserirFilho(n10);
		NoArvore<Integer> n12 = new NoArvore<Integer>(12);
		n10.inserirFilho(n12);
		NoArvore<Integer> n13 = new NoArvore<Integer>(13);
		n12.inserirFilho(n13);

		NoArvore<Integer> n4 = new NoArvore<Integer>(4);

		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		n3.inserirFilho(n8);
		n3.inserirFilho(n9);
		NoArvore<Integer> n14 = new NoArvore<Integer>(14);
		n8.inserirFilho(n14);
		NoArvore<Integer> n15 = new NoArvore<Integer>(15);
		n14.inserirFilho(n15);

		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		n7.inserirFilho(n11);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(5, a.getAltura());
		nota += 0.25;
	}

	@Test
	final void testAltura06() {
		NoArvore<String> nAA = new NoArvore<String>("AA");
		NoArvore<String> nBB = new NoArvore<String>("BB");
		NoArvore<String> nCC = new NoArvore<String>("CC");
		NoArvore<String> nDD = new NoArvore<String>("DD");
		NoArvore<String> nEE = new NoArvore<String>("EE");
		NoArvore<String> nM = new NoArvore<String>("M");
		nBB.inserirFilho(nAA);
		nCC.inserirFilho(nBB);
		nDD.inserirFilho(nCC);
		nEE.inserirFilho(nDD);
		nM.inserirFilho(nEE);
		
		NoArvore<String> nA = new NoArvore<String>("A");
		NoArvore<String> nB = new NoArvore<String>("B");
		NoArvore<String> nC = new NoArvore<String>("C");
		NoArvore<String> nD = new NoArvore<String>("D");

		nB.inserirFilho(nA);
		nC.inserirFilho(nB);
		nD.inserirFilho(nC);
		nM.inserirFilho(nD);
		
		NoArvore<String> nXX = new NoArvore<String>("XX");
		nM.inserirFilho(nXX);
		
		NoArvore<String> nR = new NoArvore<String>("R");
		NoArvore<String> nH = new NoArvore<String>("H");
		nH.inserirFilho(nR);
		nH.inserirFilho(nM);


		Arvore<String> a = new Arvore<>();
		a.setRaiz(nH);

		assertEquals(6, a.getAltura());
		nota += 0.25;
	}
	
	/*
	 * testes de nível de um nó - getNivel(No)
	 */

	@Test
	public void testNivel1() {
		System.out.println("testNivel1");
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		n3.inserirFilho(n8);

		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(2, a.getNivel(7));
		nota += 0.3125;
	}

	@Test
	public void testNivel2() {
		System.out.println("testNivel2");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n3);
		n2.inserirFilho(n5);

		n9.inserirFilho(n10);
		n7.inserirFilho(n9);
		n7.inserirFilho(n8);

		n1.inserirFilho(n7);
		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(1, a.getNivel(6));
		nota += 0.3125;
	}

	@Test
	public void testNivel3() {
		System.out.println("testNivel3");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n9.inserirFilho(n10);
		n8.inserirFilho(n9);
		n7.inserirFilho(n8);
		n6.inserirFilho(n7);

		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(5, a.getNivel(10));
		nota += 0.3125;
	}

	@Test
	public void testNivel4() {
		System.out.println("testNivel4");
		NoArvore<Integer> n1 = new NoArvore<>(1);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(0, a.getNivel(1));
		nota += 0.3125;
	}

	@Test
	public void testNivel5() {
		System.out.println("testNivel5");

		Arvore<Integer> a = new Arvore<>();

		assertEquals(-1, a.getNivel(0));
		nota += 0.3125;
	}

	@Test
	public void testNivel6() {
		System.out.println("testNivel6");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n9.inserirFilho(n10);
		n8.inserirFilho(n9);
		n7.inserirFilho(n8);
		n6.inserirFilho(n7);

		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(-1, a.getNivel(0));
		nota += 0.3125;
	}

	@Test
	final void testNivel7() {
		NoArvore<String> nAA = new NoArvore<String>("AA");
		NoArvore<String> nBB = new NoArvore<String>("BB");
		NoArvore<String> nCC = new NoArvore<String>("CC");
		NoArvore<String> nDD = new NoArvore<String>("DD");
		NoArvore<String> nEE = new NoArvore<String>("EE");
		NoArvore<String> nM = new NoArvore<String>("M");
		nBB.inserirFilho(nAA);
		nCC.inserirFilho(nBB);
		nDD.inserirFilho(nCC);
		nEE.inserirFilho(nDD);
		nM.inserirFilho(nEE);
		
		NoArvore<String> nA = new NoArvore<String>("A");
		NoArvore<String> nB = new NoArvore<String>("B");
		NoArvore<String> nC = new NoArvore<String>("C");
		NoArvore<String> nD = new NoArvore<String>("D");

		nB.inserirFilho(nA);
		nC.inserirFilho(nB);
		nD.inserirFilho(nC);
		nM.inserirFilho(nD);
		
		NoArvore<String> nXX = new NoArvore<String>("XX");
		nM.inserirFilho(nXX);
		
		NoArvore<String> nR = new NoArvore<String>("R");
		NoArvore<String> nH = new NoArvore<String>("H");
		nH.inserirFilho(nR);
		nH.inserirFilho(nM);


		Arvore<String> a = new Arvore<>();
		a.setRaiz(nH);

		assertEquals(5, a.getNivel("BB"));
		nota += 0.3125;
	}

	@Test
	final void testNivel8() {
		NoArvore<String> nAA = new NoArvore<String>("AA");
		NoArvore<String> nBB = new NoArvore<String>("BB");
		NoArvore<String> nCC = new NoArvore<String>("CC");
		NoArvore<String> nDD = new NoArvore<String>("DD");
		NoArvore<String> nEE = new NoArvore<String>("EE");
		NoArvore<String> nM = new NoArvore<String>("M");
		nBB.inserirFilho(nAA);
		nCC.inserirFilho(nBB);
		nDD.inserirFilho(nCC);
		nEE.inserirFilho(nDD);
		nM.inserirFilho(nEE);
		
		NoArvore<String> nA = new NoArvore<String>("A");
		NoArvore<String> nB = new NoArvore<String>("B");
		NoArvore<String> nC = new NoArvore<String>("C");
		NoArvore<String> nD = new NoArvore<String>("D");

		nB.inserirFilho(nA);
		nC.inserirFilho(nB);
		nD.inserirFilho(nC);
		nM.inserirFilho(nD);
		
		NoArvore<String> nXX = new NoArvore<String>("XX");
		nM.inserirFilho(nXX);
		
		NoArvore<String> nR = new NoArvore<String>("R");
		NoArvore<String> nH = new NoArvore<String>("H");
		nH.inserirFilho(nR);
		nH.inserirFilho(nM);


		Arvore<String> a = new Arvore<>();
		a.setRaiz(nH);

		assertEquals(1, a.getNivel("R"));
		nota += 0.3125;
	}
	
	/*
	 * testes de balanceamento - isBalanceada()
	 * 
	 */
	@Test
	public void testBalanceada1() {
		System.out.println("testBalanceada1");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n9.inserirFilho(n10);
		n7.inserirFilho(n9);
		n7.inserirFilho(n8);

		n1.inserirFilho(n7);
		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertFalse(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada2() {
		System.out.println("testBalanceada2");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);

		n3.inserirFilho(n4);
		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n6.inserirFilho(n10);

		n7.inserirFilho(n9);
		n7.inserirFilho(n8);

		n1.inserirFilho(n7);
		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada3() {
		System.out.println("testBalanceada3");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		// NoArvore<Integer> n4 = new NoArvore<>(4);
		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);
		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n9 = new NoArvore<>(9);
		// NoArvore<Integer> n10 = new NoArvore<>(10);

		n2.inserirFilho(n5);
		n2.inserirFilho(n3);

		n7.inserirFilho(n9);
		n7.inserirFilho(n8);

		n1.inserirFilho(n7);
		n1.inserirFilho(n6);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada4() {
		System.out.println("testBalanceada4");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);

		n1.inserirFilho(n2);
		n1.inserirFilho(n3);
		n1.inserirFilho(n4);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada5() {
		System.out.println("testBalanceada5");
		NoArvore<Integer> n1 = new NoArvore<>(1);
		NoArvore<Integer> n2 = new NoArvore<>(2);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		NoArvore<Integer> n4 = new NoArvore<>(4);

		n1.inserirFilho(n2);
		n1.inserirFilho(n3);
		n3.inserirFilho(n4);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada6() {
		System.out.println("testBalanceada6");
		NoArvore<Integer> n9 = new NoArvore<>(9);
		NoArvore<Integer> n10 = new NoArvore<>(10);
		NoArvore<Integer> n4 = new NoArvore<>(4);
		n4.inserirFilho(n10);
		n4.inserirFilho(n9);

		NoArvore<Integer> n8 = new NoArvore<>(8);
		NoArvore<Integer> n3 = new NoArvore<>(3);
		n3.inserirFilho(n8);
		n10.inserirFilho(n3);

		NoArvore<Integer> n5 = new NoArvore<>(5);
		NoArvore<Integer> n6 = new NoArvore<>(6);
		NoArvore<Integer> n7 = new NoArvore<>(7);

		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		n2.inserirFilho(n7);
		n2.inserirFilho(n6);
		n2.inserirFilho(n5);

		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertFalse(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada7() {
		System.out.println("testBalanceada7");
		Arvore<Integer> a = new Arvore<>();
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		a.setRaiz(n1);
		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

	@Test
	public void testBalanceada8() {
		System.out.println("testBalanceada8");
		Arvore<Integer> a = new Arvore<>();

		assertTrue(a.isBalanceada());
		nota += 0.375;
	}

}
