package oi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Programa {

	public static void main(String[] args) throws Exception {

		PojoRaca raca = new PojoRaca();//instancia um POJORaca
		NodeList listaRacas = leXML();//instancia uma lista de Nós baseado nos elementos do XML
		raca.setRacas(new Racas());
		raca.getRacas().setRaca(new ArrayList<>());
		geraLista(raca, listaRacas);
		
		Random rand = new Random();
		
		
		
		System.out.println(raca.getRacas().getRaca().get(rand.nextInt(listaRacas.getLength())).getAtributos());
		//System.out.println(raca);

	}
	
	
	/**
	 * 
	 * Nesse método é gerado a lista recebendo os dados do XML
	 * 
	 * */
	private static void geraLista(PojoRaca raca, NodeList listaRacas) {

		for (int i = 0; i < listaRacas.getLength(); i++) {//for com tamanho da lista passando por cada item da mesma

			Node noPessoa = listaRacas.item(i);// criando um objeto e pegando o item q se encontra no índice i

			if (noPessoa.getNodeType() == Node.ELEMENT_NODE) {//comparando se o nó é do tipo elemento

				Element elementoPessoa = (Element) noPessoa;//criando um elemento do nó e fazendo cast do nó principal para elemento 

				raca.getRacas().getRaca().add(new RacaDoABC(elementoPessoa));//construindo um objeto da Raça
			}

		}

	}

	
	
	/**
	 * Aqui o se instancia o modo de leitura do XML
	 * dando o caminho dele e qual a tag de inicio para a leitura
	 * lembrando q a tag raiz nunca é passad
	 * 
	 * */
	private static NodeList leXML() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();

		DocumentBuilder contrutor = fabrica.newDocumentBuilder();
		Document doc = contrutor.parse("src/racas.xml");
		NodeList listaRacas = doc.getElementsByTagName("raca");
		return listaRacas;
		

	}

}
