Taller: Patrón de Diseño Abstract Factory - Sistema Energético UCC
Este proyecto implementa el patrón de diseño creacional Abstract Factory para la gestión de estaciones de energía renovable (Solar y Eólica). El objetivo es demostrar cómo desacoplar la creación de familias de objetos relacionados sin especificar sus clases concretas.

📖 Caso de Estudio
Se requiere un sistema de control para la Universidad Cooperativa de Colombia (UCC) que permita gestionar diferentes tipos de plantas de energía según la ubicación geográfica:

Ambiente de Desierto: Utiliza paneles fotovoltaicos e inversores solares.

Ambiente de Costa: Utiliza turbinas de viento y sistemas de frenado electromagnético.

El sistema debe ser capaz de cambiar entre estas tecnologías de forma transparente para el usuario final.

🛠️ Tecnologías y Herramientas Utilizadas
Lenguaje: Java (OpenJDK 25).

IDE: IntelliJ IDEA 2025.3.2.

Sistema Operativo: Windows 11.

Control de Versiones: Git & GitHub.

Modelado: Diagramas de clases basados en el estándar de Ingeniería de Software.

📂 Estructura del Proyecto (ucc.energia)
El código se encuentra organizado en un único paquete para facilitar la trazabilidad académica:

Interfaces (Abstracciones): EstacionFactory, CapturadorEnergia, ReguladorVoltaje.

Familia Solar: SolarFactory, PanelFotovoltaico, InversorSolar.

Familia Eólica: EolicaFactory, TurbinaViento, ReguladorFrenado.

Cliente: GestorEnergia (encargado de la orquestación).
