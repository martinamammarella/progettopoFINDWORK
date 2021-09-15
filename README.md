

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

![exeption](https://user-images.githubusercontent.com/89917969/133500797-f4f13260-7360-4f62-8e88-add90c4e3655.PNG)

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
Parametri accettati: city,linguaggi,remote,noremote,fulltime,parttime
Esempio body:
{
    "city":[
        {"name":"Brooklyn"},
        {,"name":"Seattle"}],
    "linguaggi":[],
    "parametro":"city"}
    ![rotta2](https://user-images.githubusercontent.com/89917969/133481898-72597f07-8136-42b7-8a58-230883ea4997.JPG)

Attenzione:Se il filtraggio viene effettuato su un parametro diverso da city o linguaggi  occorre comunque inviare la richiesta con il jsonobject completo , lasciando vuoti i campi city e linguaggi, come nel seguente esempio
Body:{
    "city":[]
    "linguaggi":[],
    "parametro":"remote"

![cattura22](https://user-images.githubusercontent.com/89917969/133483411-c04bcc88-85a4-4252-adbb-17fe02b63300.JPG)
ROTTA 3
Questa rotta richiede  una  Stringa per specificare le statistiche che si vogliono visulizzare:quelle relative alle città(parametro=city)o ai linguaggi(parametro=linguaggi) selezionati dal programmatore
E' possibile anche visualizzarle entrambe utilizzando il seguente parametro=and

http://127.0.0.1:8080/statistiche?parametro=city

![1](https://user-images.githubusercontent.com/89917969/133500480-be7c838e-e97b-4f27-aafc-7763702d9bd6.JPG)

![2](https://user-images.githubusercontent.com/89917969/133500498-8006a3ad-ac07-4291-bfe1-9ffd92bd99fc.JPG)

http://127.0.0.1:8080/statistiche?parametro=linguaggi



![3](https://user-images.githubusercontent.com/89917969/133501105-771da4ff-5b73-4ef2-9e32-c3292076970a.JPG)

![4](https://user-images.githubusercontent.com/89917969/133501120-5711fad3-47b6-4e40-930c-127141dcc824.JPG)
ROTTA 4
Questa rotta richiede un body di tipo JSONObject in cui viene specificato il parametro su cui effettuare il filtraggio delle statistiche, le città/i linguaggi/la data /link.
Attenzione:quando viene inserito un jsonobject deve essere completo di tutte le coppie attributo-valore richiesto,anche se non necessario per generare le statistiche e il relativo filtraggio poichè altrimenti viene generata un'eccezione.
Attenzione:inserire per il filtraggio città e/o linguaggi scelti dal programmatore
Elenco città:
Berlin
Chicago
Seattle
Brooklyn
Plano
Elenco linguaggi:
kotlin
ruby
typescript
javascript
python
Body completo da inserire per la seguente richiesta:
//filtraggio statistiche su 2 città
http://127.0.0.1:8080/statistichefiltrate
{
    "city":[
        {"name":"Berlin"},
        {"name":"Plano"}
    ],
    "parametro":"city",
    "linguaggi":[],
    "data":"",
    "link":""}

![9](https://user-images.githubusercontent.com/89917969/133504597-dc1f30ee-7655-4b4a-aff8-532277305d7b.JPG)
![8](https://user-images.githubusercontent.com/89917969/133504619-81d69f70-8dd5-4dfa-84d7-073b140e1b55.JPG)
Attenzione:per il filtraggio attraverso la data occorre inserire la data nell'attributo data nel seguente formato:aaaa-mm-gg come nel seguente esempio.
Body completo per la richiesta :
{
    "city":[],
    "parametro":"data",
    "linguaggi":[],
    "data":"2021-07-22",
    "link":""}
    
![10](https://user-images.githubusercontent.com/89917969/133508283-8700e89b-c60c-4499-9d47-068c0d2c164d.JPG)
    
![11](https://user-images.githubusercontent.com/89917969/133508304-151cf820-1395-456d-9545-f5cc0cf18c6c.JPG)

![12](https://user-images.githubusercontent.com/89917969/133508328-f66091d8-b527-4863-852e-26be00275989.JPG)

![13](https://user-images.githubusercontent.com/89917969/133508340-c7e837eb-5856-47ca-8d6f-f5768beb447c.JPG)

![15](https://user-images.githubusercontent.com/89917969/133508369-35574171-f696-48b4-90d2-1830185cc863.JPG)

![16](https://user-images.githubusercontent.com/89917969/133508396-e8a11920-3f47-423c-96a9-c693432f3f48.JPG)




