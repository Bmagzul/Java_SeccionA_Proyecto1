package Banco;

public class CuentaBancaria {
    private int numeroCuenta;
    private String cuentaHabiente;
    private String tipoCuenta;
    private double saldo=0;
    
    public CuentaBancaria(int numero, String habiente, String tipo, double saldo) {
        this.numeroCuenta = numero;
        this.cuentaHabiente = habiente;
        this.tipoCuenta = tipo;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCuentaHabiente() {
        return cuentaHabiente;
    }

    public void setCuentaHabiente(String cuentaHabiente) {
        this.cuentaHabiente = cuentaHabiente;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double monto) {
        this.saldo += monto;
        System.out.println("Se realizo el deposito de "+monto+" a la cuenta "+this.numeroCuenta);
    }
    
    public void retiro(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Se realizo el retiro de "+monto+" a la cuenta "+this.numeroCuenta);
        } else {
            System.out.println("El saldo en la cuenta es insuficiente para realizar el retiro. Saldo actual="+this.saldo);
        }
    }
    
    
     @Override
    public String toString() {
        return "CuentaBancaria{NumeroCuenta="+this.numeroCuenta+", cuentaHabiente="+this.cuentaHabiente+", tipoCuenta="+this.tipoCuenta+", saldo="+ String.valueOf(this.saldo)+"}";
    }
    
    
}
