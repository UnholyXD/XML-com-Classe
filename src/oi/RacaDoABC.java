
package oi;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RacaDoABC
{
    private String nome;

    private int id;

    private String atributos;

    private String contra;

    public String getNome ()
    {
        return nome;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getAtributos ()
    {
        return atributos;
    }

    public void setAtributos (String atributos)
    {
        this.atributos = atributos;
    }

    public String getContra ()
    {
        return contra;
    }

    public void setContra (String contra)
    {
        this.contra = contra;
    }
    
    public RacaDoABC (Element node) {
    	NodeList listaDeNosFilhos = node.getChildNodes();
    	for (int j = 0; j < listaDeNosFilhos.getLength(); j++) {
			
			Node noFilho = listaDeNosFilhos.item(j);
			int idlocal =j;	
			if(noFilho.getNodeType() == Node.ELEMENT_NODE) {
			
				Element elementoFilho = (Element) noFilho;
				switch (elementoFilho.getTagName()) {
				case "nome":
					this.nome = ((Node) elementoFilho).getTextContent();
					break;
				case "id":
					this.id = idlocal;
					break;
				case "atributos":
					this.atributos = ((Node) elementoFilho).getTextContent();
					break;
				case "contra":
					this.contra = ((Node) elementoFilho).getTextContent();
					break;
				default:
					break;
				}
				

			}
		}
//    	this.id = node.getAttribute("id");
//    	this.contra = node.getAttribute("contra");
//    	 = node.getAttribute("nome");
//    	node.getNodeValue();
//    	this.nome = node.getElementsByTagName("nome").toString();
//    	this.atributos = node.getAttribute("atributos");
    }

    @Override
    public String toString()
    {
        return "\nnome = "+nome+"\natributos = "+atributos+"\ncontra = "+contra+"";
    }
    
    public String retornaAtributos() {
		return atributos;
		
	}
}