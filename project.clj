(defproject lsevero/yaml "1.0.0"
  :description "A YAML library for Clojure"
  :url "https://github.com/lsevero/yaml"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.yaml/snakeyaml "1.26"]
                 [org.flatland/ordered "1.5.7"]]
  :profiles {:dev {:global-vars {*warn-on-reflection* true}
                   :repl-options {:init-ns yaml.core}
                   }} 
  :source-paths ["src"]
  :java-source-paths ["src-java"])
