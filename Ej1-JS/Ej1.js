
function GenerarCompra(){
    var totalCompra=0;
    var producto;
    var cantidad;
    var valorUnitario;
    var compra;
    var validar=true;
    var bandera="SI";

    while(validar==true){
        producto = prompt("Digite el nombre del producto:");
        cantidad = parseFloat(prompt("Digite cantidad del producto: "));
        valorUnitario = parseFloat(prompt("Digite el valor unitario del producto: "));

        if(cantidad>0 && valorUnitario >0){
            compra = cantidad*valorUnitario;
            totalCompra+=compra;
        }else{
            alert("Revisar, ha ingresado un valor no valido.")
        }

        bandera = prompt("Escriba SI para continuar ingresando compras, de lo contrario finalizará.");
        if(bandera!="SI"){
            validar=false;
        }
    }

    alert("El total a pagar será de: "+totalCompra);

}