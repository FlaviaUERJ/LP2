
/*
Classe Abstrata

A)Caso representativo: 
Classe abstrata Pessoa

B) Justificativa

A classe abstrata é utilizada quando você quer que uma classe que herde dela implemente alguns métodos, mas que também possam ter métodos implementados na própria classe abstrata.

C) Esboço do Código
Está abaixo

*/

public abstract class Pessoa
{
	
	private String nome;
	private String endereco;
	public String clube;
	
	public Pessoa(String nome, String endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public abstract void associaPessoaClube(String clube);
	public abstract int calculaIdadePessoa(int anoNascimento);

}

/*
INTERFACE 

A)Caso representativo
    Interface Controle Remoto.

B) Justificativa
    em interfaces, vc só coloca a assinatura dos métodos mas sem implementá-los ou com um corpo definido, pois todos os métodos de uma interface são public abstract, logo quem implementar uma interface terá de implementar todos os métodos que estão escritos nela.

C) esboço do código
Está abaixo

*/
    
     public interface ControleRemoto
{
     /*nesse exemplo apenas a assinatura dos métodos estão presentes*/
        void mudarCanal (int canal);
        void aumentarVolume (int taxa);
        void diminuirVolume (int taxa);
        boolean ligar();
        boolean desligar();
}












b) Justificativa
A classe abstrata é utilizada quando você quer que uma classe que herde dela implemente alguns métodos, mas que também possam ter métodos implementados na própria classe abstrata.

c) Esboço do Código
Está abaixo

*/

