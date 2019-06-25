(ns core
  (:require
    [manifold.stream :as stream]
    [clojure.core.async :as a]
    ))

(comment

  ;; This throws an "Invalid symbol: stream:." error.
  (stream/stream)

  ;; This one doesn't cause an error
  (a/chan)
  )
