import static java.lang.System.currentTimeMillis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Matrix {
  // Java question: Dada uma matrix com tamanho fixo de 100 inteiros, implementar 2 abordagens
  // para classificar e avaliar a melhor abordagem
  public static void main(String[] args) {

    System.out.println("Iniciando...");
    teste1();
    teste2();
  }

  public static void teste1() {
    List<Integer> teste	=	new	ArrayList();
    long	inicio	=	System.currentTimeMillis();
    int	total	=	100;
    for	(int	i	=	0;	i	<	total;	i++)	{
      teste.add(i);
    }
    for	(int	i	=	0;	i	<	total;	i++)	{
      teste.contains(i);
    }
    Collections.sort(teste);
    long	fim	=	System.currentTimeMillis();
    double	tempo	=	(fim	-	inicio)	/	1000.0;
    //log.info(String.format("Time ArrayList:	" + tempo));
    System.out.println("Time ArrayList:	" + tempo);

  }

  public static void teste2() {
    Collection<Integer> teste	=	new HashSet();
    long	inicio	=	System.currentTimeMillis();
    int	total	=	100;
    for	(int	i	=	0;	i	<	total;	i++)	{
      teste.add(i);
    }
    for	(int	i	=	0;	i	<	total;	i++)	{
      teste.contains(i);
    }
    List<Integer> testeList = new ArrayList<Integer>(teste);
    TreeSet<Integer> tset = new TreeSet<Integer>(testeList);
    long	fim	=	System.currentTimeMillis();
    double	tempo	=	(fim	-	inicio)	/	1000.0;
    //log.info(String.format("Time HashSet:	" + tempo));
    System.out.println("Time HashSet:	" + tempo);
  }
}