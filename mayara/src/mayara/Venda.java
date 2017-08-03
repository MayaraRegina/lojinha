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
public class Venda {

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the numeroNotaFiscal
     */
    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    /**
     * @param numeroNotaFiscal the numeroNotaFiscal to set
     */
    public void setNumeroNotaFiscal(int numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
    
     public Venda() {

    }

    public int codVenda;
    public Item item;
    public int numeroNotaFiscal;
    public float total;
}
