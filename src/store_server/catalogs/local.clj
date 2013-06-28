(ns store-server.catalogs.local
  (:require [clj-yaml.core :as yaml]))

(defn get-cpg [code]
  ((yaml/parse-string (slurp "db/cpg.yaml")) code))

(defn get-bulk [code] ; TODO: dry up
  ((yaml/parse-string (slurp "db/bulk.yaml")) code))
