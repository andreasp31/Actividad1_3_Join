# Actividad 1_3: Join
Uso de Join trabajando con hilos

Yo ya había usado en el anterior ejercicio, porque me daba error y estaba mala y busqué como poder solucionarlo y ya había visto el .join()

Que tiene que tener la práctica:

* Crear las clases Cajero y Cliente.
* Que cada cajero y cada cliente sean un hilo, de esta manera podrán trabajar concurrentemente en el mismo espacio de tiempo.
* Cada cajero recibirá una lista de 4 clientes hardcoded.
* Implementar el método .join() para controlar que cada cajero sólo atienda un cliente a la vez, de esta manera simularemos que los clientes se turnan para realizar sus transacciones.
* Se simulará un intervalo de tiempo aleatorio en cada cliente mientras está realizando una transacción. *Mostrar en pantalla el funcionamiento en todo momento del sistema.
