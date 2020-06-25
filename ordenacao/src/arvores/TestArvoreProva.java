package arvores;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;

//import arvores.Arvore;
//import arvores.NoArvore;

/*
 * @author Marcel
 */

class TestArvoreProva {
	static double nota = 0;
	@Rule
	public Timeout globalTimeout = Timeout.seconds(2);

	@AfterAll
	public static void apresentaNota() {
		System.out.format("\nNOTA = %1$f \n",nota);
	}
	
	/**
	 * Test of imprimePosOrdem method, of class Arvore.
	 */
	@Test
	public void testPosOrdem1() {
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
		assertEquals("5; 6; 7; 2; 8; 3; 9; 10; 4; 1", a.imprimePosOrdem());
		nota += 0.3;
	}

	@Test
	public void testPosOrdem2() {
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
		assertEquals("4; 3; 5; 2; 6; 8; 10; 9; 7; 1", a.imprimePosOrdem());
		nota += 0.3;
	}

	@Test
	public void testPosOrdem3() {
		Arvore<Integer> a = new Arvore<>();
		assertEquals("", a.imprimePosOrdem());
		nota += 0.3;
	}

	@Test
	public void testPosOrdem4() {
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
		
		NoArvore<String> nXX = new NoArvore<String>("XX");
		nM.inserirFilho(nXX);
		
		NoArvore<String> nA = new NoArvore<String>("A");
		NoArvore<String> nB = new NoArvore<String>("B");
		NoArvore<String> nC = new NoArvore<String>("C");
		NoArvore<String> nD = new NoArvore<String>("D");

		nB.inserirFilho(nA);
		nC.inserirFilho(nB);
		nD.inserirFilho(nC);
		nM.inserirFilho(nD);

		
		NoArvore<String> nR = new NoArvore<String>("R");
		NoArvore<String> nH = new NoArvore<String>("H");
		nH.inserirFilho(nR);
		nH.inserirFilho(nM);

		Arvore<String> a = new Arvore<>();
		a.setRaiz(nH);

		assertEquals("A; B; C; D; XX; AA; BB; CC; DD; EE; M; R; H", a.imprimePosOrdem());
		nota += 0.3;
	}
	
	@Test
	public void testPosOrdem5() {
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

		assertEquals("5; 6; 7; 2; 9; 8; 3; 10; 4; 1", a.imprimePosOrdem());
		nota += 0.3;
	}
	
	/*
	 * Testes de quantidade de nós folha - getQuantidadeDeNosFolha
	 */

	@Test
	final void testFolhas0() {
		Arvore<Integer> a = new Arvore<>();
		assertEquals(0,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}
	@Test
	final void testFolhas1() {
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		assertEquals(1,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas2() {
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		n1.inserirFilho(n4);
		n1.inserirFilho(n3);
		n1.inserirFilho(n2);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);

		assertEquals(3,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas3() {
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

		assertEquals(6,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas4() {
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

		assertEquals(6,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas5() {
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

		assertEquals(4,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas6() {
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
		assertEquals(5,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	
	@Test
	final void testFolhas7() {
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

		n1.inserirFilho(n2);
		n2.inserirFilho(n3);
		n3.inserirFilho(n4);

		n4.inserirFilho(n5);
		n5.inserirFilho(n6);
		n6.inserirFilho(n7);

		n7.inserirFilho(n8);
		n8.inserirFilho(n9);
		n9.inserirFilho(n10);

		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		assertEquals(1,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas8() {
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

		n2.inserirFilho(n3);
		n3.inserirFilho(n4);
		n4.inserirFilho(n5);
		n5.inserirFilho(n6);
		
		n7.inserirFilho(n8);
		n8.inserirFilho(n9);
		n9.inserirFilho(n10);
		
		n1.inserirFilho(n7);
		n1.inserirFilho(n2);
		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		assertEquals(2,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

	@Test
	final void testFolhas9() {
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

		assertEquals(6,a.getQuantidadeDeNosFolha());
		nota += 0.35;
	}

}
