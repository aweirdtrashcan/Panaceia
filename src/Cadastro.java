/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Cadastro {
    private String name;
    private String address;
    private String cpf;
    private String addrNumber;
    private String addrComplement;
    private String uf;

    public Cadastro(String name, String address, String cpf, String addrNumber, String addrComplement, String uf) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.addrNumber = addrNumber;
        this.addrComplement = addrComplement;
        this.uf = uf;
    }
    
    public Cadastro() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }  

    public String getAddrNumber() {
        return addrNumber;
    }

    public void setAddrNumber(String addrNumber) {
        this.addrNumber = addrNumber;
    }

    public String getAddrComplement() {
        return addrComplement;
    }

    public void setAddrComplement(String addrComplement) {
        this.addrComplement = addrComplement;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "name=" + name + ", address=" + address + ", cpf=" + cpf + ", addrNumber=" + addrNumber + ", addrComplement=" + addrComplement + ", uf=" + uf + '}';
    }
      
    
}
