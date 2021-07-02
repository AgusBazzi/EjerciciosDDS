# Ejercicio: 79-Intereses

## REALIZADO:

### Package Business
- [x] TarjetaDeCredito
- [x] CuentaCorriente
- [x] CajaDeAhorro

### Package Visitor
- [x] Visitor
- [x] VisitorCalculoInteress
- [x] Visitado

### Test's


## TODO:
- [ ] Test cálculo de intereses para la tarjeta de crédito.
- [ ] Test cálculo de monto para la cuenta corriente.
- [ ] Test cálculo de monto para la caja de ahorro.

### Notas
- Evaluar si es necesario crear las clases Banco y Cliente
- Evaluar si CuentaCorriente y CajaDeAhorro pueden ser una misma clase (o heredar de una común). En este momento son diferentes y tienen un método en el Visitor diferenciado para cada una (por más que sea hasta el mismo cálculo)