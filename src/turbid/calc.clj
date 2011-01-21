(ns turbid.calc
  (:require [turbid.transaction :as transaction]
            [turbid.account :as account]))

;; perform calculations, e.g. add the 
(defn add-side [cur acc side]
  "calculate the debit or credit side of a given account"
  (reduce +
          (map #(:amount %)
               (filter #(= (side %) acc) cur))))

(defn calculate-balance [cur account]
  "calculate the balance"
  (let [debit (add-side cur account :debitAccount)
        credit (add-side cur account :creditAccount)]
    (if (or (= (:type account) "asset")
            (= (:type account) "expense")
            (= (:type account) "draw"))
      (- debit credit)
      (- credit debit))))

