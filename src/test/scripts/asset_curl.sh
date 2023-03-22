curl -v localhost:8081/assets/ -H 'Content-Type: application/json' -d '{"manufacturer": "NCR", "productId": "M6882", "serialNumber": "100", "softwareKeyId": "v1.0.6", "owner": "NCR", "contractLinearId": "3444", "isRetired": true}'

curl localhost:8081/assets/

curl localhost:8081/clients/ -H 'Content-Type: application/json' -d '{"name":"client100", "address": "100 main st", "contactName": "Well fargo", "contactPhone":"773 998 1234", "contactEmail":"wells@gmail.com" }'

curl localhost:8081/clients/search-by-name/clie

curl localhost:8081/clients/2
