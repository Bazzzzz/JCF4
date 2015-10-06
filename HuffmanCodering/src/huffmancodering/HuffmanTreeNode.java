/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmancodering;

/**
 *
 * @author sebas
 */
public class HuffmanTreeNode {
    private char character;
    private int freq;
    private HuffmanTreeNode nodeLeft;
    private HuffmanTreeNode nodeRight;
    
    public HuffmanTreeNode(char ch, int f) {
        this.character = ch;
        this.freq = f;
        this.nodeLeft = null;
        this.nodeRight = null;
    }
    public void addNodeLeft(HuffmanTreeNode nL) {
        this.nodeLeft = nL;
    }
    public void addNodeRight(HuffmanTreeNode nR) {
        this.nodeRight = nR;
    }
    public int getFreq(){
        return freq;
    }
}
