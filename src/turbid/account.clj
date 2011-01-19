(ns turbid.account)

;; three types, asset, liability, equity.
;; double entry: equity = assets - liabilities
(defrecord Account [name, type, category])

(defn new-asset-account [name category]
  "Constructor for an asset"
  (Account. name "asset" category))

(defn new-liability-account [name category]
  (Account. name "liability" category))

(defn new-equity-account [name category]
  (Account. name "equity" category))
