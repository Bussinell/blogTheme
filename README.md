# TUTORIAL

crea una cartella sul desktop ``` <nomeDellaCartella> ```. Su git bash eseguire:
```
cd $HOME/path/to/<nomeDellaCartella>
```
dove ``` path/to/ ``` rappresenta il percorso del file.
Creare un file ``` README.md ``` in Blocco note, che sarà il readme file del repository Git, e scrivere al suo interno la traccia dell'esercitazione indicata su Classroom. Salvare il file.

# Creazione reopsitory su Github
* aprire il sito github.com
* Effettuare il login
* Cliccare su ``` new ```

![image](https://github.com/Bussinell/esercitazione16maggio/assets/131137596/28e505da-9adc-47a1-9a0e-a9212c9d3dc1)
* Creare un nuovo repository nome del file, prestando attenzione a non creare un Readme di default.

![](createNewRepository.png)![image](https://github.com/Bussinell/esercitazione16maggio/assets/131137596/64702f6b-275a-45a2-a3d5-65bfedf9ffeb)
# Configurazione del repository locale e sincronizzazione
Da ``` git-bash ``` eseguire i seguenti comandi:
```
git init  # Inizializza il repository locale
git add README.md  # Inserimento del file README.md nell'area di staging
git commit -m "first commit"  # Creazione del primo commit, che serve a sincronizzare il repository locale con lo stage
git branch -M main  # Creazione del branch main, da usare come default
git remote add origin https://github.com/<username>/Esercitazione16maggio  # Connessione del repository remoto al repository locale
git push -u origin main  # Sincronizzazione del repository remoto con quello locale
```
Nel caso in cui appaia questa finestra

![](manager.png)![image](https://github.com/Bussinell/esercitazione16maggio/assets/131137596/6cc2ad3d-9501-4d33-ab09-2aa183b7fcaf)

selezionare ``` manager-ui ```.

Nel caso, invece, in cui il comando push non dovesse andare a buon fine a causa di problemi con l'autenticazione, è stato configurato un account globale, pertanto bisogna eseguire questi passi:

* aprire il seguente link https://github.com/settings/tokens
* generare un token mediante ``` Generate new token (classic) ```
* confermare l'accesso inserendo la propria password, se richiesto
* in Note inserire un messaggio come "token di accesso"
* ``` Expiration ```: "No expiration"
* In ``` Select scopes ``` spuntare la casella accanto a ``` repo ```, in modo tale da avere la situazione sottostante
* generare il token e salvarlo in un file di testo

![](token.png)![image](https://github.com/Bussinell/esercitazione16maggio/assets/131137596/5eee2666-4c26-432a-83e0-03fbb11b4a10)

Dopodiché, eseguire nuovamente il comando ``` push ``` usando il seguente formato:
```
git push https://<username>:<token>@github.com/<username>/<reponame>.git
```

dove ``` <username> ``` è il vostro username, al posto di ``` <token> ``` bisogna inserire il token creato prima e ``` <reponame> ``` è il nome del repository sul quale si vuole effettuare il ``` push ``` (in questo caso, ``` <reponame> ``` è ``` Git-tutorial ```).

# Aggiunta di nuovi file al repository
1. Creare un nuovo file ``` main.c ``` nel workspace
2. Implementare un programma che, dati in input 10 numeri positivi, trovi il massimo e lo visualizzi a video
3. Aggiungere il nuovo file nell'area di staging
4. Sincronizzare l'area di staging con il repository locale (usando un messaggio di commit congruo)
5. Sincronizzare il repository remoto con quello locale
# Inserire immagini nel README.md
Aggiungere l'immagine ``` img.jpg ``` al progetto ed inserirla nel testo con il seguente comando: ``` ![](img.png) ```
# Inserire sezioni
Le sezioni possono essere create inserendo un ``` # ``` prima del titolo della sezione. Si può modificare il tipo di sezione usando da uno a sei ``` # ```. È importante separare i ``` # ``` dal titolo con uno spazio.
# Inserire codice e citazioni
Il codice può essere inserito delimitandolo con tre backtick `.

Le citazioni possono essere fatte aggiungendo ``` > ```prima del testo.
