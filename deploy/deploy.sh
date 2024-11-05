DOCKER_IMAGE_NAME="tourist-guide"
DOCKER_IMAGE_TAG="latest"
DOCKER_REGISTRY="<fiap>/tourist-guide"
K8S_DEPLOYMENT_FILE="k8s-deployment.yaml"
K8S_SECRET_FILE="my-db-secret.yaml"

echo "Construindo a imagem Docker..."
docker build -t $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG .

echo "Fazendo push para o Docker Registry..."
docker tag $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG $DOCKER_REGISTRY:$DOCKER_IMAGE_TAG
docker push $DOCKER_REGISTRY:$DOCKER_IMAGE_TAG

echo "Aplicando o Deployment e Service no Kubernetes..."
kubectl apply -f $K8S_DEPLOYMENT_FILE

echo "Criando ou atualizando o Secret no Kubernetes..."
kubectl apply -f $K8S_SECRET_FILE

echo "Verificando o status do Deployment..."
kubectl rollout status deployment/tourist-guide-deployment

echo "Verificando os pods no Kubernetes..."
kubectl get pods

echo "Verificando o Service..."
kubectl get svc tourist-guide-service

echo "Verificando o Ingress..."
kubectl get ingress tourist-guide-ingress

echo "Deploy concluído com sucesso!"
