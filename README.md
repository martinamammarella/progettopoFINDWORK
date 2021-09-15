
# progettopoFINDWORK
##  Introduzione
 L'aaplicazione presentata offre diverse funzionalità
-visualizzazione  di tutte le offerte di lavoro reperibili  reperibili su  https://findwork.dev/api/jobs/;
-filtraggio delle offerte  di lavoro in base al parametro specificato dall'utente : lavori in remoto o non, lavori full time o part time, una o più città da specificare, uno o più linguaggi da specificare;
 -visulizzazione delle statistiche effettuate sulle città o sui linguaggi. Le città su cui sono state effettuate le statistiche sono:Berlin,Seattle,Brooklyn,Chicago,Plano e i linguaggi sono:ruby, typescript,javascript, python, kotlin.Vengono mostrati  le quantità di lavori  in remoto o non, part time o full time  per ogni città e per ogni linguaggio;
 -filtraggio delle statistiche:le statistiche effettuate possono essere filtrate in base ad una o più città, uno o più linguaggi, una data, un "source" specificati dall'utente.(In questo caso occorre specificare  città e linguaggi fra quelli selezionati dal programmatore per effettuare  statistiche altrimenti si genererà un errore).

## Diagramma dei casi d'uso
Il diagramma dei casi d'uso esprime un comportamento, offerto o desiderato, sulla base dei suoi risultati osservabili, in cui l'oggetto esaminato è solitamente un sistema o una sua parte. La sua funzionalità consiste nell'individuare chi o che cosa ha a che fare con il sistema(attore) e che cosa viene fatto(casi d'uso).

![casi d'uso](https://user-images.githubusercontent.com/89917969/133432378-486b6b2f-4a66-4659-ab51-a59ffb6380e3.PNG)

## Diagrammi delle classi
Il diagramma delle classi illustra una collezione di elementi dichiarativi di un modello come classi e tipi, assieme ai loro contenuti e alle loro relazioni. Serve per individuare gli elementi di un sistema.

![controller](https://user-images.githubusercontent.com/89917969/133440267-a39d5e80-2fda-4c58-a683-e9444d509e18.PNG) 

![exeption](https://user-images.githubusercontent.com/71433608/133479093-f925eb8b-8f76-4d6d-947f-9a10d8b9687e.PNG)

![model](https://user-images.githubusercontent.com/89917969/133440282-d55510aa-0a45-4edb-99ff-2da18f8d3d52.PNG)

![service](https://user-images.githubusercontent.com/89917969/133440288-b9a78ead-b814-4d97-acb9-4b16fe97f72e.PNG)
![utils](https://user-images.githubusercontent.com/89917969/133440291-97b84dc0-ba74-4d4f-ab9f-d630dafbbe60.PNG)

## Diagrammi Sequenziali
I diagrammi di sequenza modellano le interazioni tra gli oggetti in un unico caso d’uso. Essi illustrano come le diverse parti di un sistema interagiscono tra loro per svolgere una funzione, e l’ordine in cui le interazioni avvengono quando un particolare caso d’uso viene eseguito. In parole più semplici, un diagramma di sequenza mostra diverse parti del lavoro di un sistema in una ‘sequenza’ per ottenere qualcosa.
![filtri](https://user-images.githubusercontent.com/89917969/133441016-39721fd3-4621-4496-b083-881a3e04dd00.PNG)

![lavori](https://user-images.githubusercontent.com/89917969/133441021-5cf5f19a-9b8b-4385-9a92-6872b586d6e2.PNG)


![stats](https://user-images.githubusercontent.com/89917969/133441029-3700d0a3-8010-4548-ac3e-265cb50cd89f.PNG)
##            Rotte
L'utente può effettuare le richieste tramite Postman al seguente indirizzo localhost:8080.
![Cattura](https://user-images.githubusercontent.com/89917969/133470040-d92c6fd2-a19e-4148-a3a5-1efb5376c520.JPG)
##  Esempi applicazione delle rotte 
ROTTA 1
![rotta1](https://user-images.githubusercontent.com/89917969/133478419-05e9dcef-d01c-474c-994e-c152cdff10c9.JPG)
ROTTA 2 
Questa rotta richiede un body del tipo JSONObject in cui sia specificato il tipo di parametro su cui filtrare, le città/ linguaggi su cui effettuare il filtraggio.
Esempio body:
{
    "city":[
        {"name":"Brooklyn"},
        {"name":"Seattle"}
        
    ],
    "linguaggi":[],
    "parametro":"city"
}






