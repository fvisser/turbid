(ns turbid.main
  (:require [turbid.transaction :as transaction]
            [turbid.account :as account])
  (:use [clj-time.core :only [date-time now plus minus days months years]]))


;; namespace tracking the current state of progress. This will slowly
;; evolve into a program reading transactions and categorizing them

(def rabobank-rekening
  (account/new-asset-account "Rabobank Rekening" "cash"))

(def equity-account
  (account/new-equity-account "Unspecified Equity" "unspecified"))

(def income-account
  (account/new-income-account "Unspecified Income" "unspecified"))

(def expense-account
  (account/new-expense-account "Unspecified Expenses" "unspecified"))

(def transactions [])

(def accounts [])
