curl -v -X POST localhost:8081/clients/ \
   -H 'Content-Type: application/json' \
   -d '{"name": "Wells Fargo", "address": "123 yellowbrick", "contact_name": "cname", "contact_email": "email", "contact_phone": "cphone"}'

curl -v -X POST localhost:8081/clients/ \
   -H 'Content-Type: application/json' \
   -d '{"name": "Chase", "address": "123 yellowbrick", "contact_name": "cname", "contact_email": "email", "contact_phone": "cphone"}'

curl -v -X POST localhost:8081/clients/ \
   -H 'Content-Type: application/json' \
   -d '{"name": "Bank of America", "address": "123 yellowbrick", "contact_name": "cname", "contact_email": "email", "contact_phone": "cphone"}'

curl localhost:8081/clients/
