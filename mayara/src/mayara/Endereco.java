/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayara;

/**
 *
 * @author aluno
 */
 public class Endereco {

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the Tipologradoro
     */
    public String getTipologradoro() {
        return Tipologradoro;
    }

    /**
     * @param Tipologradoro the Tipologradoro to set
     */
    public void setTipologradoro(String Tipologradoro) {
        this.Tipologradoro = Tipologradoro;
    }

    /**
     * @return the logradoro
     */
    public String getLogradoro() {
        return logradoro;
    }

    /**
     * @param logradoro the logradoro to set
     */
    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }
     
     public Endereco () {
         
     }
     
     
     private int numero;
     private String Tipologradoro;
     private String logradoro;
     private String complemento;
     private String bairro;
     private String cidade;
     private String estado;
     private String pais;
     private int cep;
     
     
 }
     
    

