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
public class Banco {

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the nomebanco
     */
    public String getNomebanco() {
        return nomebanco;
    }

    /**
     * @param nomebanco the nomebanco to set
     */
    public void setNomebanco(String nomebanco) {
        this.nomebanco = nomebanco;
    }

    /**
     * @return the descricao
     */
    public int getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }

    public Banco() {

    }

    public int agencia;
    public String nomebanco;
    public int descricao;

}
