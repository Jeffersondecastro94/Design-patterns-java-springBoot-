package padroes.gof;

import padroes.gof.facade.Facade;
import padroes.gof.singleton.SingletonEager;
import padroes.gof.singleton.SingletonLazy;
import padroes.gof.singleton.SingletonLazyHolder;
import padroes.gof.strategy.Comportamento;
import padroes.gof.strategy.ComportamentoAgressivo;
import padroes.gof.strategy.ComportamentoDefensivo;
import padroes.gof.strategy.ComportamentoNormal;
import padroes.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
// Singleton

SingletonLazy lazy = SingletonLazy.getInstancia();
System.out.println(lazy);
lazy = SingletonLazy.getInstancia();
System.out.println(lazy);

SingletonEager eager = SingletonEager.getInstancia();
System.out.println(eager);
eager = SingletonEager.getInstancia();
System.out.println(eager);

SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
System.out.println(lazyHolder);
lazyHolder = SingletonLazyHolder.getInstancia();
System.out.println(lazyHolder);


Comportamento defensivo = new ComportamentoDefensivo();
Comportamento normal = new ComportamentoNormal();
Comportamento agressivo = new ComportamentoAgressivo();

Robo robo = new Robo();
robo.setComportamento(normal);
robo.mover();
robo.mover();
robo.setComportamento(defensivo);
robo.mover();
robo.setComportamento(agressivo);
robo.mover();
robo.mover();
robo.mover();	

//Facade

Facade facade = new Facade();
facade.migrarCliente("jefferson", "135352672");
	
	}
	
}