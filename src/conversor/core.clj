(ns conversor.core
  (:require [conversor.formatador :refer [formatar]]
            [conversor.interpretador-de-opcoes :refer [interpretar-opcoes]]
            [conversor.cambista :refer [obter-cotacao]])
  (:gen-class))


(defn -main
  [& args]
  ;; _destructuring_
  (let [{:keys [de para]}(interpretar-opcoes args)]
    (-> (obter-cotacao de para)
        (formatar de para)
        (prn))))
